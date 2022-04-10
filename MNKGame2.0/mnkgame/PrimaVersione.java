/*
 *  Copyright (C) 2021 Pietro Di Lena
 *  
 *  This file is part of the MNKGame v2.0 software developed for the
 *  students of the course "Algoritmi e Strutture di Dati" first 
 *  cycle degree/bachelor in Computer Science, University of Bologna
 *  A.Y. 2020-2021.
 *
 *  MNKGame is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This  is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this file.  If not, see <https://www.gnu.org/licenses/>.
 */

package mnkgame;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import javax.sound.midi.SysexMessage;

/**
 * Software player only a bit smarter than random.
 * <p>
 * It can detect a single-move win or loss. In all the other cases behaves
 * randomly.
 * </p>
 */
public class PrimaVersione implements MNKPlayer {
	private Random rand;
	private MNKBoard B;
	private MNKGameState myWin;
	private MNKGameState yourWin;
	private MNKCellState myState;
	private MNKCellState yourState;
	private int TIMEOUT;

	/**
	 * Default empty constructor
	 */
	public PrimaVersione() {
	}

	public record Albero(
		Albero parent,
		LinkedList<Albero> children
	) {
	}

	public void initPlayer(int M, int N, int K, boolean first, int timeout_in_secs) {
		// New random seed for each game
		rand = new Random(System.currentTimeMillis());
		B = new MNKBoard(M, N, K);

		if (first) {
			myWin = MNKGameState.WINP1;
			yourWin = MNKGameState.WINP2;
			myState = MNKCellState.P1;
			yourState = MNKCellState.P2;
		}
		else {
			myWin = MNKGameState.WINP2;
			yourWin = MNKGameState.WINP1;
			myState = MNKCellState.P2;
			yourState = MNKCellState.P1;
		}
		TIMEOUT = timeout_in_secs;
	}

	/**
	 * Selects a position among those listed in the <code>FC</code> array.
	 * <p>
	 * Selects a winning cell (if any) from <code>FC</code>, otherwise
	 * selects a cell (if any) that prevents the adversary to win
	 * with his next move. If both previous cases do not apply, selects
	 * a random cell in <code>FC</code>.
	 * </p>
	 */
	public MNKCell selectCell(MNKCell[] FC, MNKCell[] MC) {
		long start = System.currentTimeMillis();
		if (MC.length > 0) {
			MNKCell c = MC[MC.length - 1]; // Recover the last move from MC
			B.markCell(c.i, c.j); // Save the last move in the local MNKBoard
		}

		MNKCell bestGuess = FC[0];
		float bestValue = 0;
		for (int k = 0; k < FC.length; k++) { // Prova tutte le possibili mosse
			// If time is running out, return the best guess
			if ((System.currentTimeMillis() - start) / 1000.0 > TIMEOUT * (99.0 / 100.0)) {
				B.markCell(bestGuess.i, bestGuess.j);
				return bestGuess;
			}
			
			MNKCell candidateCell = FC[k];
			B.markCell(candidateCell.i, candidateCell.j);

			if (B.gameState() == myWin) {
				return candidateCell;
			}
			
			// Check for a 1 move loss
			int pos   = rand.nextInt(FC.length);
			MNKCell c = FC[pos]; // random move
			B.markCell(c.i,c.j); // mark the random position	
			for(int k2 = 0; k2 < FC.length; k2++) {
			// If time is running out, return the randomly selected  cell
      			if((System.currentTimeMillis()-start)/1000.0 > TIMEOUT*(99.0/100.0)) {
					return c;
				} else if(k2 != pos && FC[k2] != candidateCell) {     
					MNKCell d = FC[k2];
					if(B.markCell(d.i,d.j) == yourWin) {
						B.unmarkCell();        // undo adversary move
						B.unmarkCell();	       // undo my move	 
						B.markCell(d.i,d.j);   // select his winning position
						return d;							 // return his winning position
					} else {
						B.unmarkCell();	       // undo adversary move to try a new one
					}
			}	
		}
			

			if (bestValue < boardValue()) {
				bestGuess = candidateCell;
			}

			B.unmarkCell();
		}

		B.markCell(bestGuess.i, bestGuess.j);
		System.out.println("Mossa scelta" + bestGuess.toString());
		return bestGuess;
	}
	
	// Conto in quanti modi posso vincere nella situazione attuale sommando gli slot dove posso vincere e sottraendo quelli dove vince lui
	public float boardValue() {
		int myCells = 0;
		int hisCells = 0;
		int freeCells = 0;
		boolean finito;
		float res = 0;
		float[][] matrixSum = new float[B.M][B.N];

		// Horizontal check
		for (int i = 0; i < B.M; i++) {
			for (int jRig = 0; jRig < B.N; jRig++) {
				myCells = 0;
				hisCells = 0;
				finito = false;
				for (int j = jRig; j < B.N - B.K && !finito; j++) {
					if (B.cellState(i, j) == myState) {
						myCells++;
					}
					else if (B.cellState(i, j) == yourState) {
						hisCells++;
					}
					else {
						freeCells++;
					}
				}
				
				res += (float) 1 / (B.K - myCells);
				System.out.println(res);
			}
		}
		
		System.out.println(B.getMarkedCells()[B.getMarkedCells().length - 1]);
		System.out.println(res);


		// Vertical check
		// TO DO

		// Diagonal check
		// TO DO

		// Anti-diagonal check
		// TO DO

		// Trovo cella con valore più alto

		return res;
	}

	public String playerName() {
		return "PrimaVersione";
	}
}
