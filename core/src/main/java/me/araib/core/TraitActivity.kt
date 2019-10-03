package me.araib.core

import android.content.Intent
import android.os.Bundle

abstract class TraitActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initTraits()
    }

    abstract fun initTraits()

    abstract fun handleTraitResult(requestCode: Int, resultCode: Int, data: Intent?)

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        handleTraitResult(requestCode, resultCode, data)
        super.onActivityResult(requestCode, resultCode, data)
    }
}