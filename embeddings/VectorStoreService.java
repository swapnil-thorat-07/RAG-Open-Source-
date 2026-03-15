package embeddings;

import dev.langchain4j.data.embedding.Embedding;

public class VectorStoreService {

    private final QdrantClient client;

    public VectorStoreService() {
        this.client = new QdrantClient();
    }

    public void store(String id, Embedding embedding, String payload) {

        client.insertVector(
                id,
                embedding.vector(),
                payload
        );
    }
}