package refactoring.smell.long_method.kanban;

/**
 * @author meixuesong
 */
public class QueryBuilder {
    public QueryBuilder should() {
        return this;
    }

    public void match(String summary, String search) {
    }

    public QueryBuilder filter() {
        return this;
    }

    public QueryBuilder term(String stateId, String stateId1) {
        return this;
    }
}
