fun Test() {
    val context = LocalContext.current
    val myColor = Color(0xFF31B2D2)
    val myColor2 = Color(0xFF7A6E00)

    Box(modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.Center
    ){
        var textNewValue by remember {
            mutableStateOf("")
        }
        Column(modifier = Modifier.padding(bottom = 80.dp),
            verticalArrangement = Arrangement.SpaceAround)
        {TextField(value = textNewValue,
            onValueChange = {newText->textNewValue = newText},
            label = {Text(text = "GMAIL: ")},
            maxLines = 30,
//            modifier = Modifier.width(400.dp),
            placeholder = {Text(text = "enter:")},
            singleLine = true,
            leadingIcon = {Icon(imageVector = Icons.Outlined.Email,
                contentDescription = "enter")},


            colors = TextFieldDefaults.colors(
                unfocusedIndicatorColor = myColor,
                focusedIndicatorColor = myColor,
                cursorColor = myColor,
                unfocusedLabelColor = myColor,
                focusedLabelColor = myColor,
                unfocusedLeadingIconColor = myColor,
                focusedLeadingIconColor = myColor,
                unfocusedTrailingIconColor = myColor,
                focusedTrailingIconColor = myColor,
                focusedContainerColor = myColor.copy(0.3f),
                unfocusedContainerColor = myColor.copy(alpha = 0.1f)
            ),
            shape = RoundedCornerShape(15.dp),

           trailingIcon = {
               IconButton(onClick = {  }) {
                   Icon(imageVector = Icons.Outlined.Send,
                       contentDescription = "send",)}
           }
        )
        }
        var textPass by remember {
            mutableStateOf("")
        }
        Column(
            modifier = Modifier.padding(top = 80.dp),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            TextField(
                value = textPass,
                onValueChange = { newText -> textPass = newText },
                label = { Text(text = "PASSWORD: ") },
                placeholder = { Text(text = "enter:") },
                visualTransformation = PasswordVisualTransformation(),
                singleLine = true,
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Password,
                        contentDescription = "enter")},

                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = myColor2,
                    focusedIndicatorColor = myColor2,
                    cursorColor = myColor2,
                    unfocusedLabelColor = myColor2,
                    focusedLabelColor = myColor2,
                    unfocusedLeadingIconColor = myColor2,
                    focusedLeadingIconColor = myColor2,
                    unfocusedTrailingIconColor = myColor2,
                    focusedTrailingIconColor = myColor2,
                    focusedContainerColor = myColor2.copy(0.3f),
                    unfocusedContainerColor = myColor2.copy( 0.1f)
                ),
                shape = CutCornerShape(10.dp),

                trailingIcon = {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Outlined.Send,
                            contentDescription = "send")}


                }
            )
        }

        Column(modifier = Modifier.padding(top = 220.dp),
            ) {
            Button(onClick = { Toast.makeText(context, "GMAIL: $textNewValue",
                Toast.LENGTH_SHORT).show()
                Toast.makeText(context, "PASSWORD: $textPass",
                    Toast.LENGTH_SHORT).show()}) {
            Icon(
                imageVector = Icons.Default.Login,
                contentDescription = "Submit")}
    }
    }
}