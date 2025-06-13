# Android - AspectRatioLayout

[![Platform](https://img.shields.io/badge/platform-Android-brightgreen)](https://developer.android.com)
[![API](https://img.shields.io/badge/API-21%2B-brightgreen)](https://android-arsenal.com/api?level=21)
[![License](https://img.shields.io/github/license/TakWolf/Android-AspectRatioLayout)](LICENSE)
[![JitPack](https://jitpack.io/v/TakWolf/Android-AspectRatioLayout.svg)](https://jitpack.io/#TakWolf/Android-AspectRatioLayout)

A simple aspect ratio layout for Android.

## Screenshot

![Screenshot](docs/screenshot.png)

## Usage

```kotlin
repositories {
    maven { setUrl("https://jitpack.io") }
}

dependencies {
    implementation("com.github.TakWolf:Android-AspectRatioLayout:0.0.1")
}
```

```xml
<com.takwolf.android.aspectratiolayout.AspectRatioLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:arl_widthRatio="4"
    app:arl_heightRatio="3">

    <YourView />
    
</com.takwolf.android.aspectratiolayout.AspectRatioLayout>
```

That's it!

PS: `AspectRatioLayout` is extends `FrameLayout`.

## Another way

There is another way to make aspect ratio layout by [ConstraintLayout](https://developer.android.google.cn/training/constraint-layout) like:

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    
    <View 
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="?colorPrimary"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constrainedHeight="true"
        app:layout_constraintDimensionRatio="16:9" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

## License

[Apache License 2.0](LICENSE)
