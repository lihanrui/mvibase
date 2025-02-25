# mvibase
A multi-screen MVI sample project with NavController using Jetpack Compose and Clean Architecture principles.


# Motivation
Many MVI template projects on GitHub lack integration with the latest Jetpack features. This project aims to provide a comprehensive starting point for mobile app developers, allowing them to quickly launch a multi-screen application and move from concept to implementation efficiently.

# Features

    Multi-screen navigation using NavController

    MVI (Model-View-Intent) architecture

    Clean Architecture principles

    Jetpack Compose for modern UI development

    Dependency Injection with Koin

    Local data persistence with Room


# Libraries
* Jetpack Compose

* Navigation Component

* Koin for Dependency Injection

* Room for local database


Getting Started

1. Clone the repository

2. Open the project in Android Studio

3. Build and run the app

# Project Structure

```
app/
├── data/
│   ├── local/
├── di/
├── domain/
│   └── usecase/
│   └── repository/
├── model/
│   ├── intent/
│   ├── state/
├── presentation/
│   ├── navigation/
│   └── screens/
└── view/
    ├── activity/
    ├── navigation/
    ├── screens/
    ├── theme/
```



# FAQs

Why Jetpack Compose?
* Modern UI development favors code as design over XML layouts. Google's recommended best practices advocate for Jetpack Compose. Build speed and recomposition optimization are also factors.

Will this scale?
* MVI is designed for organizations with multiple teams. In such a case you may want to reorganize the project structure by feature, rather than by application component.


Why Koin and not Hilt?
* Both can be used. Here I went with Koin as it is lightweight, has faster build speed, and is scope-aware. Moreover, it is KMP-compatible, a direction that Google IO 2024 seemed to be implying the industry is moving towards.

Why not use more interfaces?
* We've struck a balance between advanced best practices and practical, reworkable code. This approach reduces the learning curve associated with complex architectures while maintaining flexibility.

# Contributing

Contributions are welcome! Please feel free to submit a Pull Request.
