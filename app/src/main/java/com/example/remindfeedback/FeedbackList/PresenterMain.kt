package com.example.remindfeedback.FeedbackList

import android.content.Context
import android.util.Log
import java.util.ArrayList

class PresenterMain : ContractMain.Presenter {

    lateinit override var view: ContractMain.View

    override fun loadItems(list: ArrayList<ModelFeedback>) {


        //list.add(dict) //마지막 줄에 삽입
        view.refresh()
    }

    override fun addItems(position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeItems(position: Int, id: Int, context: Context) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateItems(position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }




}