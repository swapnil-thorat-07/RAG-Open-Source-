package rag;

import java.util.List;

public class RAGPipeline {

    private final RetrieverService retriever;
    private final PromptBuilder promptBuilder;

    public RAGPipeline() {

        this.retriever = new RetrieverService();
        this.promptBuilder = new PromptBuilder();
    }

    public String answer(String question) {

        List<String> docs = retriever.retrieve(question);

        String prompt = promptBuilder.buildPrompt(question, docs);

        return callLLM(prompt);
    }

    private String callLLM(String prompt) {

        System.out.println("Prompt sent to LLM:");
        System.out.println(prompt);

        return "Sample answer from LLM.";
    }
}