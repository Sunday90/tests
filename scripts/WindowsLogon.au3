$title="Требуется аутентификация"
WinWaitActive($title)
Send($CmdLine[1])
Send("{TAB}")
Send($CmdLine[2])
Send("{ENTER}")