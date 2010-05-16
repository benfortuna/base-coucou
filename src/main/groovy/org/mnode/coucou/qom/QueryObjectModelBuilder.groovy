/**
 * This file is part of Base Modules.
 *
 * Copyright (c) 2010, Ben Fortuna [fortuna@micronode.com]
 *
 * Base Modules is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Base Modules is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Base Modules.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.mnode.coucou.qom

import javax.jcr.query.QueryManagerimport javax.jcr.ValueFactory

/**
 * @author Ben
 *
 */
public class QueryObjectModelBuilder extends FactoryBuilderSupport {

    public QueryObjectModelBuilder(QueryManager queryManager) {
        this(queryManager, null)
    }
    
    public QueryObjectModelBuilder(QueryManager queryManager, ValueFactory valueFactory) {
        registerFactory('and', new AndFactory(queryManager: queryManager))
        registerFactory('ascending', new AscendingFactory(queryManager: queryManager))
        registerFactory('bindVariable', new BindVariableFactory(queryManager: queryManager))
        registerFactory('childNode', new ChildNodeFactory(queryManager: queryManager))
        registerFactory('comparison', new ComparisonFactory(queryManager: queryManager, valueFactory: valueFactory))
        registerFactory('descending', new DescendingFactory(queryManager: queryManager))
        registerFactory('fullTextSearch', new FullTextSearchFactory(queryManager: queryManager, valueFactory: valueFactory))
        registerFactory('propertyValue', new PropertyValueFactory(queryManager: queryManager))
        registerFactory('query', new QueryFactory(queryManager: queryManager))
        registerFactory('selector', new SelectorFactory(queryManager: queryManager))
    }
    
}
