package com.nitin.build_logic

sealed class AppFlavor(
    val name: String,
    val applicationIdSuffix: String? = null,
    val appName: String,
    val apiBaseUrl: String
) {
    data object Development : AppFlavor(
        name = "development",
        applicationIdSuffix = ".dev",
        appName = "MyApp Dev",
        apiBaseUrl = "https://dev-api.example.com"
    )

    data object PreProd : AppFlavor(
        name = "preProd",
        applicationIdSuffix = ".preprod",
        appName = "MyApp PreProd",
        apiBaseUrl = "https://preprod-api.example.com"
    )

    data object QA : AppFlavor(
        name = "qa",
        applicationIdSuffix = ".qa",
        appName = "MyApp QA",
        apiBaseUrl = "https://qa-api.example.com"
    )
}
