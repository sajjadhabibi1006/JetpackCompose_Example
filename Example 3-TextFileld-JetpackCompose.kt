fun Test() {
    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.Center
    ){
        var textNewValue by remember {
            mutableStateOf("")
        }
        Column(verticalArrangement = Arrangement.SpaceAround)
        {TextField(value = textNewValue,
            onValueChange = {newText->textNewValue = newText},
            label = {Text(text = "GMAIL: ")},
            maxLines = 30,
//            modifier = Modifier.width(400.dp),
            placeholder = {Text(text = "Hello")},
//            visualTransformation = PasswordVisualTransformation(),
            leadingIcon = {Icon(imageVector = Icons.Outlined.Email,
                contentDescription = "enter")},
            trailingIcon = {
                IconButton(onClick = { Toast.makeText(context,textNewValue,
                    Toast.LENGTH_SHORT).show() }) {
                    Icon(imageVector = Icons.Outlined.Send,
                        contentDescription = "send")}
            }
        )
        }

    }
}