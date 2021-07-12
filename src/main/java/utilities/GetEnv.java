package utilities;

import io.github.cdimascio.dotenv.Dotenv;

public class GetEnv {
    public static Dotenv dotenv = Dotenv.configure().filename(".user.data").
            ignoreIfMalformed().ignoreIfMissing().load();
}

