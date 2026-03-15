package rag;

import java.util.List;

public class PromptBuilder {

    public String buildPrompt(String question, List<String> docs) {

        StringBuilder context = new StringBuilder();

        for (String doc : docs) {
            context.append(doc).append("\n");
        }

        return """
                You are a helpful assistant answering questions about Chewy.

                Context:
                %s

                Question:
                %s
                """.formatted(context.toString(), question);
    }
}