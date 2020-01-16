package com.example.remindfeedback.Login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.remindfeedback.R
import com.example.remindfeedback.Register.RegisterActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), ContractLogin.View {

    private val TAG = "LoginActivity"
    internal lateinit var presenterLogin: PresenterLogin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        presenterLogin = PresenterLogin().apply {
            view = this@LoginActivity
            mContext = this@LoginActivity
        }

        // 스플레시 띄우는 부분
        presenterLogin.showSplash(this, this)

        //로그인버튼
        login_Button.setOnClickListener {
            if (email_Edittext.text.isNotEmpty() && password_Edittext.text.isNotEmpty()) {
                presenterLogin.LogIn(email_Edittext.text.toString(), password_Edittext.text.toString())
                // finish()
            } else if (email_Edittext.text.isEmpty()) {
                Toast.makeText(this, "이메일을 입력해주세요.", Toast.LENGTH_SHORT).show()
            } else if (password_Edittext.text.isEmpty()) {
                Toast.makeText(this, "비밀번호를 입력해주세요.", Toast.LENGTH_SHORT).show()
            }
        }

        //회원가입 버튼
        register_Tv.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            //finish()
        }

    }
}