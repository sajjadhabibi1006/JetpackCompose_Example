fun Test() {
    val myColor = Color(0xffFF7A6E00)
  Box(modifier = Modifier.fillMaxSize(),
      contentAlignment = Alignment.Center
      ){
      Card(modifier = Modifier.height(320.dp).width(250.dp),
          elevation = CardDefaults.cardElevation(5.dp),
          //colors = CardDefaults.cardColors(Color.Gray.copy(0.1f))
          ){
          Column(modifier = Modifier.fillMaxWidth()) {
              Image(painter = painterResource(id = R.drawable.test), contentDescription = null)

              Text(text = "MyFont", fontSize = 20.sp, fontWeight = FontWeight.Bold,
                  modifier = Modifier.padding(10.dp))
              Text(text = "Lorem Ipsum is dummy text incomprehensible yet simple originating from the printing industry and utilized by graphic designers, typesetters, and publishers of newspapers and magazines. It serves current technological needs and diverse applications aimed at enhancing practical tools. Addressing the past, present, and future requires a deep understanding by society and professionals alike; through software, this fosters greater insight among computer designers—particularly creative ones—and promotes a progressive culture within the Persian language. Ultimately, one can hope that the difficulties inherent in devising solutions and the arduous nature of typesetting will be resolved, allowing the time required for core typesetting tasks to be effectively utilized to address the ongoing questions of the design community.",
                  fontSize = 17.sp, maxLines = 5, overflow = TextOverflow.Ellipsis,
                  modifier = Modifier.padding(start = 5.dp),
                  color = Color.Black
              )
          }
      }
  }
}