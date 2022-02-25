package com.example.projemanag.utils

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import android.webkit.MimeTypeMap
import com.example.projemanag.activities.activities.MyProfileActivity

object Constants {
    const val USERS: String = "users"

    const val BOARDS: String = "boards"

    const val IMAGE: String = "image"
    const val NAME: String = "name"
    const val MOBILE: String = "mobile"
    const val ASSIGNED_TO: String = "assignedTo"
    const val TASK_LIST: String = "taskList"

    const val DOCUMENT_ID: String = "documentId"

    const val BOARD_DETAIL: String = "board_detail"

    const val READ_STORAGE_PERMISSION_CODE = 1
    const val PICK_IMAGE_REQUEST_CODE = 2

    const val ID = "id"

    const val EMAIL = "email"

    const val BOARDS_MEMBERS_LIST: String = "board_members_list"

    const val SELECT = "Select"
    const val UN_SELECT = "UnSelect"

    const val PROJEMANAG_PREFERENCES = "ProjemangPrefs"
    const val FCM_TOKEN_UPDATED = "fcmTokenUpdated"
    const val FCM_TOKEN = "fcmToken"

    const val FCM_BASE_URL:String = "https://fcm.googleapis.com/fcm/send"
    const val FCM_AUTHORIZATION:String = "authorization"
    const val FCM_KEY:String = "key"
    const val FCM_SERVER_KEY:String = "AAAAX16sB_E:APA91bGTpalibpGLeOW9yPgwCD6wJ76MdNuHvp4PQAD3Ly7G7FJVxShApP3ao9wAqyboCiZ4KS9Ia0YsjEoL0MhQiWOYGr8R6EwztLbzeWny4xXRujw5c6HYQ7b_V8jWb1E7YhZK5Eh4"
    const val FCM_KEY_TITLE:String = "title"
    const val FCM_KEY_MESSAGE:String = "message"
    const val FCM_KEY_DATA:String = "data"
    const val FCM_KEY_TO:String = "to"

    const val TASK_LIST_ITEM_POSITION: String = "task_list_item_position"
    const val CARD_LIST_ITEM_POSITION: String = "card_list_item_position"

    fun showImageChooser(activity: Activity){
        var galleryIntent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        activity.startActivityForResult(galleryIntent, PICK_IMAGE_REQUEST_CODE)
    }

    fun getFileExtension(activity: Activity, uri: Uri?): String?{
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(activity.contentResolver.getType(uri!!))
    }
}