CREATE TABLE accounting_entries (
    id BIGSERIAL PRIMARY KEY,
    customer_name TEXT,                    -- Debería estar en una tabla aparte
    customer_tax_id TEXT,                 -- Redundante por cliente
    document_code TEXT,                   -- Ej: 'INV-2023-00123'
    document_type TEXT,                   -- Ej: 'INVOICE', 'RECEIPT' (debería ser FK)
    entry_date TEXT,                      -- Debería ser DATE
    amount NUMERIC,                          -- Debería ser NUMERIC
    currency TEXT,                        -- Debería normalizarse (ej: tabla de monedas)
    account_code TEXT,                    -- Ej: '110505' (activo corriente)
    account_name TEXT,                    -- 'Caja general' (debería ser tabla contable)
    created_at TIMESTAMP DEFAULT now()    -- Correcto, pero debería generarse desde app
);