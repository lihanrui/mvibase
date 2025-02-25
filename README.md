# mvibase
Multi-screen MVI sample project with NavController

# Motivation
While there are many other MVI template projects on Github, it is difficult to find one that uses the latest principles of Clean Architecture and Jetpack features.

This template project is intended to serve as a basic starting point for mobile app devs, to skip the setup steps and launch a multi-screen application and get you from concept to implementation as fast as possible.

# Libraries
Jetpack Compose
MVI architecture
Koin DI
Room

# FAQs


Why Jetpack Compose?
* Modern UI development favors code as design over XML layouts. Google's recommended best practices advocate for Jetpack Compose. Build speed and recomposition optimization are also factors.


Why not use more interfaces?
* I've found interfaces to be much of the learning curve when it comes to learning application architecture; to get to a single class definition, often times one has to dig through layers of interfaces. Here there is a balance between advanced best practices and practical, reworkable code. 


Will this scale?
* MVI is designed for organizations with multiple teams. In such a case you may want to reorganize the project structure by feature, rather than by application component.


Why Koin and not Hilt?
* Both can be used. Here I went with Koin as it is lightweight, has faster build speed, and is scope-aware. Moreover, it is KMP-compatible, a direction that Google IO 2024 seemed to be implying the industry is moving towards.
