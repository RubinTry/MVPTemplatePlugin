package com.github.rubintry.mvptemplateplugin.services

import com.intellij.openapi.project.Project
import com.github.rubintry.mvptemplateplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
