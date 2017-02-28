# Android AspectRatioLayout #

[![Build Status](https://travis-ci.org/TakWolf/Android-AspectRatioLayout.svg?branch=master)](https://travis-ci.org/TakWolf/Android-AspectRatioLayout)
[![Download](https://api.bintray.com/packages/takwolf/maven/Android-AspectRatioLayout/images/download.svg)](https://bintray.com/takwolf/maven/Android-AspectRatioLayout/_latestVersion)
[![Platform](https://img.shields.io/badge/platform-Android-green.svg?style=flat)](https://www.android.com)
[![API](https://img.shields.io/badge/API-1%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=1)
[![License](https://img.shields.io/github/license/TakWolf/Android-AspectRatioLayout.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)

A simple aspect ratio layout for Android.

## ScreenShot ##

![ScreenShot](art/screenshot.png)

## Usage ##

### Gradle ###

```
compile 'com.takwolf.android:aspectratio:0.0.1'
```

### Layout ###

```
<com.takwolf.android.aspectratio.AspectRatioLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:arl_widthRatio="4"
    app:arl_heigthRatio="3">

    <YourView />

</com.takwolf.android.aspectratio.AspectRatioLayout>
```

PS: AspectRatioLayout is extends FrameLayout.

## Author ##

TakWolf

[takwolf@foxmail.com](mailto:takwolf@foxmail.com)

[http://takwolf.com](http://takwolf.com)

## License ##

```
Copyright 2015 TakWolf

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
