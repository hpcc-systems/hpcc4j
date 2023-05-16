Import STD;
String subfilename := '~benchmark::all_types::200KB';
String sfname := '~benchmark::all_types::superfile';
IF(false = STD.file.SuperFileExists(sfname),STD.file.CreateSuperFile(sfname));
output(STD.file.SuperFileExists(sfname));
IF (STD.file.GetSuperFileSubCount(sfname) = 0, STD.file.AddSuperFile(sfname, subfilename));
