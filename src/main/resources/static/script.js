import './styles/app.scss';

// start the Stimulus application
import './bootstrap';


function indice() {
    alert('Indice : Bon ok, on ne vous a peut-être pas tout dit.\n' +
        'Les "1" ne sont pas des nombres et le "+" n\'est pas une addition.\n' +
        'En booléen il y a deux valeurs : 0 pour faux, et 1 pour vrai.\n' +
        'Le plus est un opérateur logique qui a pour résultat vrai si l\'un des deux opérandes est vrai.\n' +'\nLa réponse attendue est un chiffre.');
}
document.getElementById('assistanteIdee').addEventListener('click', function() {
    indice();
});
