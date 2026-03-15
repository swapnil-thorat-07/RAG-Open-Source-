package rag;

import java.util.List;

public class ContextAssembler {

    public String assemble(List<String> docs) {

        StringBuilder builder = new StringBuilder();

        for (String doc : docs) {

            builder.append(doc).append("\n\n");
        }

        return builder.toString();
    }
}