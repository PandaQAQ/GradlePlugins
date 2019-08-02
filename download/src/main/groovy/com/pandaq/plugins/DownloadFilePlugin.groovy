package com.pandaq.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

class DownloadFilePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        def extension = project.extensions.create("download", DownloadConfig)
        project.afterEvaluate {
            DownloadUtil.download(extension.target_path, extension.icon_url)
        }
    }
}