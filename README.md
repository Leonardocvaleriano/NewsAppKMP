# News App KMP (Work in Progress)

## Introduction
Build a Kotlin Multiplatform app which will consume an API and store local data. The business Logic will be shared, but the UI will be built individually for each platform.

## What's shared?

* Model
* Networking
* ViewModel
* Data storage

## Technologies/Frameworks

* Network Requests (Ktor)
* Local Persistence Data (Room)
* Saving Simple Data (Jetpack DataStore - Preferences DataStore)
* Jetpack Compose
* Swift UI

## Design Patterns

* Clean Code
* MVVM and MVI
* Dependency Injection (Koin)

## Extra Information

This is a Kotlin Multiplatform project targeting Android, iOS.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

* `/shared` is for the code that will be shared between all targets in the project.
  The most important subfolder is `commonMain`. If preferred, you can add code to the platform-specific folders here too.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…