### A macro that uses external files

This sbt projects shows an example of macro that uses an external file and that attaches the list of the files used to produce the expansion.

Using [this modified version](http://github.com/Duhemm/sbt/tree/external-text-files) of [sbt](https://github.com/sbt/sbt), sbt will recompile all macro clients that depend on the external file `utils/utils.txt` whenever it is modified.
