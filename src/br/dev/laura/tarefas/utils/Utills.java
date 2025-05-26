package br.dev.laura.tarefas.utils;

import java.util.UUID;

public class Utills {

	public static String gerarUUID8() {
		UUID uuid = UUID.randomUUID();
		String uuidStr = uuid.toString();
		String uuid8 = uuidStr.substring(0, 8);
		return uuid8;

	}

}
