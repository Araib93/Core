package me.araib.core

import android.content.Intent

abstract class TraitActivity : BaseActivity() {
    abstract fun initTraits()

    abstract fun handleTraitResult(requestCode: Int, resultCode: Int, data: Intent?)

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        handleTraitResult(requestCode, resultCode, data)
        super.onActivityResult(requestCode, resultCode, data)
    }
}