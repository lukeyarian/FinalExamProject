package com.example.finalexamproject

import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import com.example.finalexamproject.FirebaseUtil

class AuthViewModel : ViewModel() {
    private val firebaseAuth: FirebaseAuth = FirebaseUtil.auth

    fun loginUser(email: String, password: String, onSuccess: () -> Unit, onFailure: (Exception) -> Unit) {
        firebaseAuth.signInWithEmailAndPassword(email, password)
            .addOnSuccessListener {
                onSuccess()
            }
            .addOnFailureListener { e ->
                onFailure(e)
            }
    }

    fun registerUser(email: String, password: String, onSuccess: () -> Unit, onFailure: (Exception) -> Unit) {
        firebaseAuth.createUserWithEmailAndPassword(email, password)
            .addOnSuccessListener {
                onSuccess()
            }
            .addOnFailureListener { e ->
                onFailure(e)
            }
    }

    fun signOut() {
        firebaseAuth.signOut()
    }

    fun isUserLoggedIn(): Boolean {
        return firebaseAuth.currentUser != null
    }
}