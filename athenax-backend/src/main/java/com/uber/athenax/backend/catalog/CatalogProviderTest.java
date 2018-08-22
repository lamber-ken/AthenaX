package com.uber.athenax.backend.catalog;

import com.uber.athenax.vm.api.tables.AthenaXTableCatalog;
import com.uber.athenax.vm.api.tables.AthenaXTableCatalogProvider;

import java.util.List;
import java.util.Map;

public class CatalogProviderTest implements AthenaXTableCatalogProvider{
    @Override
    public Map<String, AthenaXTableCatalog> getInputCatalog(String cluster) {
        return null;
    }

    @Override
    public AthenaXTableCatalog getOutputCatalog(String cluster, List<String> outputs) {
        return null;
    }
}
