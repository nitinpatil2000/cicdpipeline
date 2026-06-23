package com.nitin.build_logic

import com.android.build.api.dsl.ApplicationExtension

fun ApplicationExtension.configureFlavors() {
    val flavors = listOf(
        AppFlavor.Development,
        AppFlavor.PreProd,
        AppFlavor.QA
    )

    flavorDimensions += "environment"
    productFlavors {
        flavors.forEach { flavor ->
            create(flavor.name) {
                dimension = "environment"
                applicationIdSuffix = flavor.applicationIdSuffix
                
                // Add BuildConfig fields for the app to use
                buildConfigField("String", "API_BASE_URL", "\"${flavor.apiBaseUrl}\"")
                buildConfigField("String", "APP_NAME", "\"${flavor.appName}\"")
                
                // You can also add manifest placeholders here if needed
                manifestPlaceholders["appName"] = flavor.appName
            }
        }
    }
}
