#!/bin/bash
# Use for clean all *.class and all ._* file from this directory

find . -type f -name '*.class' -delete

find . -type f -name '._*' -delete

echo Done!