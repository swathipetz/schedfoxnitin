/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmischeduleserver.mysqlconnectivity.queries.waypoints;

import rmischeduleserver.mysqlconnectivity.queries.GeneralQueryFormat;

/**
 *
 * @author user
 */
public class get_waypoints_by_id_query extends GeneralQueryFormat {

    @Override
    public boolean hasAccess() {
        return true;
    }
    
    @Override
    public String getPreparedStatementString() {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM ");
        sql.append("client_waypoint ");
        sql.append("WHERE ");
        sql.append("client_waypoint_id = ?");
        return sql.toString();
    }
    
    @Override
    public boolean hasPreparedStatement() {
        return true;
    }
    
}
