package sample.liquibase;

import liquibase.database.Database;
import liquibase.diff.DiffResult;
import liquibase.exception.LiquibaseException;
import liquibase.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.sql.SQLException;


public class Diff {
//    @Autowired
//    private  Logger logger ;
//    /**
//     * Compare 2 databases using diff liquibase function
//     *
//     * @param paasTestDbUrl
//     * @param paasTestDbUser
//     * @param paasTestDbPassword
//     * @param paasTestDb2Url
//     * @param paasTestDb2User
//     * @param paasTestDb2Password
//     * @return SimpleDiffResult containing a flag indicating if diffreneces have been found and a text representation of those differences
//     * @throws SQLException
//     * @throws LiquibaseException
//     * @throws IOException
//     * @throws ParserConfigurationException
//     */
//    public DiffResult diff(String paasTestDbUrl, String paasTestDbUser, String paasTestDbPassword, String paasTestDb2Url, String paasTestDb2User,
//                           String paasTestDb2Password) throws SQLException, LiquibaseException, IOException, ParserConfigurationException {
//
//        logger.debug("Running liquibase diff between db: " + paasTestDbUrl + " and db: " + paasTestDb2Url);
//        Database referenceDatabase = null;
//        Database targetDatabase = null;
//
//        try {
//            referenceDatabase = createDatabase(paasTestDbUrl, paasTestDbUser, paasTestDbPassword);
//            targetDatabase = createDatabase(paasTestDb2Url, paasTestDb2User, paasTestDb2Password);
//
//            final DiffGeneratorFactory generatorFactory = DiffGeneratorFactory.getInstance();
//            final CompareControl compareControl = new CompareControl();
//
//
//            final DiffResult diffResult = generatorFactory.compare(referenceDatabase, targetDatabase, compareControl);
//
//            boolean ignoreDefaultValueDifference = false;
//            if (ignoreDefaultValueDifference) {
//                Map<DatabaseObject, ObjectDifferences> changedObjects = diffResult.getChangedObjects();
//                for (DatabaseObject changedDbObject : changedObjects.keySet()) {
//                    ObjectDifferences objectDifferences = changedObjects.get(changedDbObject);
//                    if (objectDifferences.removeDifference("defaultValue")) {
//                        logger.info("Ignoring default value for {}", changedDbObject.toString());
//                    }
//                    if (!objectDifferences.hasDifferences()) {
//                        logger.info("removing {}, no difference left.", changedDbObject.toString());
//                        changedObjects.remove(objectDifferences);
//                    }
//                }
//            }
//
//            return diffResult;
//
//        } finally {
//            closeDatabase(referenceDatabase);
//            closeDatabase(targetDatabase);
//        }
//    }
}
