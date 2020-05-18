package br.com.martins.valdelar.repository;

import br.com.martins.valdelar.model.Cotacao;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
@ApplicationScoped
public class CotacaoRepository {

    @Inject
    MongoClient mongo;

    public Cotacao save(Cotacao cotacao) {
        Document document = new Document()
                .append("cotacaoCompra", cotacao.getCotacaoCompra())
                .append("cotacaoVenda", cotacao.getCotacaoVenda())
                .append("dataHoraCotacao", cotacao.getDataHoraCotacao());
        getCollection().insertOne(document);
        return cotacao;
    }

    private MongoCollection getCollection() {
        return mongo.getDatabase("cotacao").getCollection("cotacao");
    }
}
