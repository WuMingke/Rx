package com.erkuai.rx

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.rxjava3.core.Observable
import java.util.*

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        test()
    }

    private fun test() {

        val list = ArrayList<String>()
        for (i in 0..10) {
            list.add("$i")
        }

        var index = 0

        Observable.fromCallable {
            ""
        }.doOnComplete {

        }.subscribe {
            Log.i("wmkwmk", it)
        }

        Observable.create<String> {
            it.onNext(list[index])
            it.onComplete()
        }.doOnComplete {
            index++
            Log.i("wmkwmk", "test: Complete")
        }.subscribe({
            Log.i("wmkwmk", it)
        }, {
            Log.i("wmkwmk", it.toString())
        })
    }
}