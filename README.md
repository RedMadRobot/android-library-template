# Stub

[![License](https://img.shields.io/github/license/RedMadRobot/android-library-template?style=flat-square)][license]

Stub and no more spoilers.

---
<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->

- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

## Installation

Add the dependency:

```groovy
repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation("com.redmadrobot.stub:stub:<version>")
}
```

## Usage

## Contributing

Merge requests are welcome.  
For major changes, please open an issue first to discuss what you would like to change.

## Checklist after repository creation (remove after checked)

- Update developers in [publishing plugin](buildSrc/src/main/kotlin/convention.publishing.gradle.kts)
- remove `./cleanup.sh TestTemplate` from [main.yml](.github/workflows/main.yml)

[license]: ../LICENSE
