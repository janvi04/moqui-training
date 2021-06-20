def training = ec.entity.makeValue("moqui.training.MoquiTraining")
training.setFields(context, true, null, null)
training.setSequencedIdPrimary()
training.create()