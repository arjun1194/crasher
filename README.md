# Crasher

Crasher is an Android library designed to facilitate intentional crashes within your application for testing purposes. This can be particularly useful for ensuring robust error handling and graceful recovery mechanisms within your app.

## Initialization

To get started with Crasher, initialize it as follows:

```kotlin
val crasher = Crasher()
```

## Features

### 1. Java Crash

You can trigger a Java crash within your application using the following method:

```kotlin
crasher.createJavaCrash()
```

### 2. C++ Crash

For C++ crashes, Crasher provides a method to facilitate this:

```kotlin
crasher.createNativeCxxCrash()
```

### 3. ANR (Application Not Responding)

To simulate an ANR scenario within your app, you can utilize the following method:

```kotlin
crasher.createANR()
```

## Usage

Crasher is primarily intended for testing purposes and should not be included in production builds of your application. It's recommended to use it within a controlled testing environment to evaluate your app's behavior under various failure conditions.

## Disclaimer

Intentionally crashing your application during testing should be done with caution and in controlled environments. Make sure to handle crashes appropriately and ensure that your application can recover gracefully from unexpected failures.

## Contribution

Contributions to Crasher are welcome! If you encounter any issues, have suggestions for improvements, or would like to contribute new features, feel free to submit a pull request or open an issue on GitHub.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

**Note:** Please remember to include appropriate error handling and logging mechanisms within your application to ensure that crashes are properly reported and managed in production environments.
