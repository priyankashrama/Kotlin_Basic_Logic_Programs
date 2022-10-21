private fun showDialog(title: String) {
    val dialog = Dialog(activity)
    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
    dialog.setCancelable(false)
    dialog.setContentView(R.layout.custom_layout)
    val body = dialog.findViewById(R.id.body) as TextView
    body.text = title
    val yesBtn = dialog.findViewById(R.id.yesBtn) as Button
    val noBtn = dialog.findViewById(R.id.noBtn) as TextView
    yesBtn.setOnClickListener {
        dialog.dismiss()
    }
    noBtn.setOnClickListener { dialog.dismiss() }
    dialog.show()

}
