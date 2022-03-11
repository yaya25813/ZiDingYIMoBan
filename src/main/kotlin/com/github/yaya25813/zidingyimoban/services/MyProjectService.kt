package com.github.yaya25813.zidingyimoban.services

import com.intellij.openapi.project.Project
import com.github.yaya25813.zidingyimoban.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
