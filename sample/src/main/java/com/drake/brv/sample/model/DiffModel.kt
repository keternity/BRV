package com.drake.brv.sample.model

data class DiffModel(var id: String, var content: String) {
    override fun toString() = content
}