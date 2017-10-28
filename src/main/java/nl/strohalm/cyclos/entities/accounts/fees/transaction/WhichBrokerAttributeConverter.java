package nl.strohalm.cyclos.entities.accounts.fees.transaction;

import nl.strohalm.cyclos.entities.converters.StringValuedEnumAttributeConverter;

import javax.persistence.Converter;

@Converter(autoApply = true)
public class WhichBrokerAttributeConverter extends StringValuedEnumAttributeConverter<BrokerCommission.WhichBroker> {
}
