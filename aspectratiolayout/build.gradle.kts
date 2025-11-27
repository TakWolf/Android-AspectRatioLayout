plugins {
    id("com.android.library")
    id("com.vanniktech.maven.publish")
}

android {
    namespace = "com.takwolf.android.aspectratiolayout"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        minSdk = 23

        consumerProguardFiles("consumer-rules.pro")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    compileOnly("androidx.annotation:annotation:1.9.1")
}

mavenPublishing {
    coordinates("io.github.takwolf.android.aspectratiolayout", "aspectratiolayout", "0.0.1")

    pom {
        name.set("Android-AspectRatioLayout")
        description.set("A simple aspect ratio layout for Android.")
        url.set("https://github.com/TakWolf/Android-AspectRatioLayout")
        inceptionYear.set("2025")
        licenses {
            license {
                name.set("Apache-2.0")
                url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                distribution.set("repo")
            }
        }
        developers {
            developer {
                id.set("TakWolf")
                name.set("TakWolf")
                url.set("https://github.com/TakWolf")
            }
        }
        scm {
            url.set("https://github.com/TakWolf/Android-AspectRatioLayout")
            connection.set("scm:git:git://github.com/TakWolf/Android-AspectRatioLayout.git")
            developerConnection.set("scm:git:ssh://git@github.com/TakWolf/Android-AspectRatioLayout.git")
        }
    }

    publishToMavenCentral()
    signAllPublications()
}
