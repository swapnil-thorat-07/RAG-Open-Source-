package rag;

import java.util.ArrayList;
import java.util.List;

public class RetrieverService {

    public List<String> retrieve(String query) {

        List<String> documents = new ArrayList<>();

        documents.add("Chewy Autoship allows recurring deliveries of pet supplies.");
        documents.add("Chewy offers dog food, cat food and pet medications.");

        return documents;
    }
}