package com.gabrielferrari.whatsapp.model

import com.google.firebase.firestore.ServerTimestamp
import java.util.Date

class Conversa(
    val idUsuarioRemetente: String = "",
    val idUsuarioDestinatario: String = "",
    val foto: String = "",
    val nome: String = "",
    val ultimaMensagem: String = "",
    @ServerTimestamp
    val data: Date? = null
)
