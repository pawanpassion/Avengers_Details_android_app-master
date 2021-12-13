package com.example.avengersdetails

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LogInActivity : AppCompatActivity() {
    lateinit var etmobile:EditText
    lateinit var etpassword:EditText
    lateinit var btnLogin: Button
    lateinit var txtforgot:TextView
    lateinit var txtSignup:TextView
    //val validPassword= arrayOf("tony","hulk","steve","thanos","shivam")
    var mobile:String?=""
    var password:String?=""
    var username:String?="no"
    var flag=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        title = "Log In"
        txtforgot=findViewById(R.id.txtForgot)
        txtSignup=findViewById(R.id.txtSignup)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            etmobile = findViewById(R.id.etMobile)
            mobile = etmobile.text.toString()
            etpassword = findViewById(R.id.etPassword)
            password = etpassword.text.toString()
            if (mobile == "0123456789") {
                val intent = Intent(this, MainActivity::class.java)
                if(password=="tony"){
                    username="Tony Stark"
                    flag=1
                    intent.putExtra("name","Tony Stark")
                    startActivity(intent)
                }
                if(password=="hulk"){
                    username="Bruce Banner"
                    intent.putExtra("name",username)
                    flag=1
                    startActivity(intent)
                }
                if(password=="steve"){
                    username="Steve Rogers"
                    intent.putExtra("name",username)
                    flag=1
                    startActivity(intent)
                }
                if(password=="thanos"){
                    username="Avenger"
                    intent.putExtra("name",username)
                    flag=1
                    startActivity(intent)
                }
                if(password=="shivam"){
                    username="Shivam Kushwaha"
                    intent.putExtra("name",username)
                    flag=1
                    startActivity(intent)
                }
                else{
                    Toast.makeText(this, "Invalid Credential", Toast.LENGTH_SHORT).show()
                }

                if(flag==1){
                    Toast.makeText(this, "Welcome $username", Toast.LENGTH_SHORT).show()
                }

            }
            else{
                Toast.makeText(this, "Invalid Credential", Toast.LENGTH_SHORT).show()
            }
        }
        txtforgot.setOnClickListener {
            Toast.makeText(this, "It's your Fault, bro", Toast.LENGTH_SHORT).show()
    }
        txtSignup.setOnClickListener {
            Toast.makeText(this, "Coming soon......", Toast.LENGTH_SHORT).show()
        }
    }

}
