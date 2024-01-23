# actinium

A very minimal genetic algorithm framework for Scala.

## Provenance? ##

This used to be part of the [Kinetic Merge codebase](https://github.com/sageserpent-open/kineticMerge), being used to
find matching sections of code across commits being merged. It worked, but was superseded by a custom algorithm taking
advantage of certain characteristics of the problem that allowed a systematic search for the optimal matching.

Nevertheless, it was interesting in its own right, and had a fair bit of effort invested into testing it as a framework
against a toy problem, so it's been broken out of that repository and placed here for posterity.

It isn't sophisticated - but it is tested at a unit level and seems robust enough.

## Caveats ##

1. It isn't packaged up for Sonatype / Maven Central. For now, it's a curiosity - feel free to copy the code, or bring
   it in as a subproject in SBT, shading the local JAR into your published JAR if needs be.
2. You will need to try out variations of chromosome encoding if you don't want to hit a *Hamming Wall*. This is part of
   genetic algorithm use in general, not just this implementation. The toy example certainly encountered a Hamming Wall
   using the first chromosome encoding that came to mind, and the current revised implementation will hit one if the
   test dials are turned up again. I'm sure that could be fixed once and for all, but at the time the focus was on using
   this for matching rather than scaling the toy problem up.
3. There is no internal parallelization for evaluation of phenotypes - it's all single threaded for now.
