// Building Gadget
crafting.addShaped('buildinggadgets:buildingtool', item('buildinggadgets:buildingtool'), [
    [null, metaitem('electric.motor.lv'), null],
    [ore('plateIron'), metaitem('power_unit.lv'), ore('plateIron')],
    [ore('plateIron'), ore('circuitLv'), ore('plateIron')]
])

// Exchanging Gadget
crafting.addShaped('buildinggadgets:exchangertool', item('buildinggadgets:exchangertool'), [
    [null, metaitem('electric.piston.lv'), null],
    [ore('plateIron'), metaitem('power_unit.lv'), ore('plateIron')],
    [ore('plateIron'), ore('circuitLv'), ore('plateIron')]
])

// Copy Paste Gadget
crafting.addShaped('buildinggadgets:copypastetool', item('buildinggadgets:copypastetool'), [
    [null, metaitem('electric.piston.lv'), ore('gearSmallIron')],
    [ore('plateIron'), metaitem('power_unit.lv'), ore('plateIron')],
    [ore('plateIron'), ore('circuitLv'), ore('plateIron')]
])

// Destruction Gadget
crafting.addShaped('buildinggadgets:destructiontool', item('buildinggadgets:destructiontool'), [
    [null, metaitem('toolHeadDrillIron'), null],
    [ore('plateIron'), metaitem('power_unit.lv'), ore('plateIron')],
    [ore('plateIron'), ore('circuitLv'), ore('plateIron')]
])

// item('buildinggadgets:templatemanager')

// Template Manager
crafting.replaceShaped('buildinggadgets:templatemanager', item('buildinggadgets:templatemanager'), [
    [ore('plateIron'), metaitem('electric.motor.lv'), ore('plateIron')],
    [ore('plateIron'), ore('paper'), ore('plateIron')],
    [ore('plateIron'), ore('circuitLv'), ore('plateIron')]
])
 
// Construction Block Powder
crafting.remove('buildinggadgets:constructionblockpowder');

recipemap('mixer').recipeBuilder()
		.inputs(ore('dustSand')	 * 1)
		.fluidInputs(fluid('concrete') * 4000)
		.outputs(item('buildinggadgets:constructionblockpowder') * 5)
		.EUt(7)
		.duration(200)
		.buildAndRegister()

// Construction Paste Containers
crafting.replaceShaped('buildinggadgets:constructionpastecontainer', item('buildinggadgets:constructionpastecontainer'), [
    [ore('toolHammer'), ore('plateSteel'), ore('toolScrewdriver')],
    [ore('plateSteel'), ore('blockGlass'), ore('plateSteel')],
    [ore('plateSteel'), ore('plateSteel'), ore('plateSteel')]
])

crafting.replaceShaped('buildinggadgets:constructionpastecontainert2', item('buildinggadgets:constructionpastecontainert2'), [
    [ore('toolHammer'), ore('plateAluminium'), ore('toolScrewdriver')],
    [ore('plateAluminium'), ore('blockGlass'), ore('plateAluminium')],
    [ore('plateAluminium'), ore('plateAluminium'), ore('plateAluminium')]
])

crafting.replaceShaped('buildinggadgets:constructionpastecontainert3', item('buildinggadgets:constructionpastecontainert3'), [
    [ore('toolHammer'), ore('plateStainlessSteel'), ore('toolScrewdriver')],
    [ore('plateStainlessSteel'), ore('blockGlass'), ore('plateStainlessSteel')],
    [ore('plateStainlessSteel'), ore('plateStainlessSteel'), ore('plateStainlessSteel')]
])
