import { MelhorJogadorClientPage } from './app.po';

describe('melhor-jogador-client App', () => {
  let page: MelhorJogadorClientPage;

  beforeEach(() => {
    page = new MelhorJogadorClientPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
