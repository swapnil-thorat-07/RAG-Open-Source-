package api;

import rag.RAGPipeline;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private final RAGPipeline pipeline;

    public ChatService() {
        this.pipeline = new RAGPipeline();
    }

    public String ask(String question) {

        return pipeline.answer(question);
    }
}