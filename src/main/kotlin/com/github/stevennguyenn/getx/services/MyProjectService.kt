package com.github.stevennguyenn.getx.services

import com.github.stevennguyenn.getx.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
