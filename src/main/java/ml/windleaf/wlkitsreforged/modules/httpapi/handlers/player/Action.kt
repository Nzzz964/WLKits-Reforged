package ml.windleaf.wlkitsreforged.modules.httpapi.handlers.player

enum class Action(val string: String) {
    NULL("null"),
    KICK("kick"), KILL("kill"), BAN("ban"), PARDON("pardon"),
    CLEAR("clear"), TP("tp"), MSG("msg");
}